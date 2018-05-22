package com.example.kevinlee.examinsurance.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.kevinlee.examinsurance.R;
import com.example.kevinlee.examinsurance.model.BasicActivity;

public class Entrance_activity extends BasicActivity {
    private Button login;
    private Button register;

    @Override
    protected void initActivity() {
        setContentView(R.layout.entrance_layout);
        login = (Button) findViewById(R.id.entrance_login);
        register = (Button) findViewById(R.id.entrance_register);

        login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(Entrance_activity.this, Login_activity.class);
                startActivity(intent);
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