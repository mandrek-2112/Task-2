package com.example.rutanjit.iecsetask2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn =(Button) findViewById(R.id.cont);
        btn.setOnClickListener( new View.OnClickListener()
        {
            public void onClick (View v){
                //  finish();
                change(v);
            }
        });
    }
    public void change(View view) {
        Intent intent1 = new Intent(this, Main2Activity.class);
        startActivity(intent1);
    }

}

