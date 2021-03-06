/*
    程序入口活动，选择进入注册或登录
 */
package com.example.kevinlee.examinsurance.activity;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.kevinlee.examinsurance.R;

public class Entrance_activity extends AppCompatActivity {
    TextView title;
    Button login;
    Button register;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_entrance);

        ActionBar actionBar=getSupportActionBar();
        if(actionBar!=null){
            actionBar.hide();
        }
        title = (TextView) findViewById(R.id.title_bar) ;
        title.setText("考试保险");

        login = (Button) findViewById(R.id.entrance_login);
        register = (Button) findViewById(R.id.entrance_register);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Entrance_activity.this, Login_activity.class);
                startActivity(intent);
                finish();
            }
        });
        register.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Entrance_activity.this, Register_activity.class);
                startActivity(intent);
            }
        });
    }
}