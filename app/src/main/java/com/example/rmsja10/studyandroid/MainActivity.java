package com.example.rmsja10.studyandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mission01Button = (Button)findViewById(R.id.btn_mission01);
        Button mission02Button = (Button)findViewById(R.id.btn_mission02);
        Button mission06Button = (Button)findViewById(R.id.btn_mission06);
        Button loginButton = (Button)findViewById(R.id.btn_login);

        View.OnClickListener clickListener = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btn_mission01:
                        Intent intent = new Intent(getApplicationContext(), Mission01Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_mission02:
                        intent = new Intent(getApplicationContext(), Mission02Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_mission06:
                        intent = new Intent(getApplicationContext(), Mission06Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.btn_login:
                        intent = new Intent(getApplicationContext(), MissionLoginActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };

        mission01Button.setOnClickListener(clickListener);
        mission02Button.setOnClickListener(clickListener);
        mission06Button.setOnClickListener(clickListener);
        loginButton.setOnClickListener(clickListener);
    }
}
