package com.lamos.componenttest;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by lamos on 12/24/2017.
 */

public class SimpleActivity extends AppCompatActivity {
    private String AppTitle;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_simple);

        AppTitle = getIntent().getStringExtra("title");

        TextView Title = (TextView)findViewById(R.id.title);
        Title.setText(AppTitle);
    }

    public void setButton(int id, String title, View.OnClickListener listener){
        Button button = (Button)findViewById(id);
        button.setVisibility(0);
        button.setText(title);
        button.setOnClickListener(listener);
    }
}
