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
        mission01Button.setOnClickListener(new ButtonClickListner(Mission01Activity.class));

        Button mission02Button = (Button)findViewById(R.id.btn_mission02);
        mission02Button.setOnClickListener(new ButtonClickListner(Mission02Activity.class));

        Button loginButton = (Button)findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new ButtonClickListner(MissionLoginActivity.class));
    }

    class ButtonClickListner implements View.OnClickListener{

        Class c;

        ButtonClickListner(Class c){
            this.c = c;
        }

        public void onClick(View v){
            Intent intent = new Intent(getApplicationContext(), c);
            startActivity(intent);
        }
    }
}
