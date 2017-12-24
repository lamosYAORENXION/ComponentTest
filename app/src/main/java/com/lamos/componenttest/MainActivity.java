package com.lamos.componenttest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import Activity.SecondActivity;
import Service.ServiceActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activity = (Button)findViewById(R.id.activity);
        activity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = SecondActivity.newinstance(MainActivity.this,"This is SecondAcitivity");
                startActivity(intent);
            }
        });

        Button service = (Button)findViewById(R.id.service);
        service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = ServiceActivity.newInstance(MainActivity.this,"This is ServiceActivity");
                startActivity(intent);
            }
        });

    }

}
