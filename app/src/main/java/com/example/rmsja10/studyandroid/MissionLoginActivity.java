package com.example.rmsja10.studyandroid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.rmsja10.studyandroid.common.Protocol;

public class MissionLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mission_login);

        Button mainButton = (Button)findViewById(R.id.btn_main);
        mainButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                finish();
            }
        });

        Button loginButton = (Button)findViewById(R.id.btn_login);
        loginButton.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

                EditText idText = (EditText)findViewById(R.id.editTextId);
                EditText pwText = (EditText)findViewById(R.id.editTextPw);

                if(idText.getText().length() != 0 && pwText.getText().length() != 0){
                    Intent intent = new Intent(getApplicationContext(), Mission03Activity.class);
                    //startActivityForResult(intent, Protocol.ActivityType.Mission03.getActivityType());
                    startActivity(intent);
                }else{
                    Toast toast = Toast.makeText(getBaseContext(),"ID 또는 PW가 입력되지 않았습니다", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

    }

    public void onActivityResult(int requestCode, int resultCode, Intent intent){
        if(requestCode == Protocol.RequestType.Memu.getRequestType()){

            Log.d("requestCode : %s", String.valueOf(requestCode));

            if(resultCode == RESULT_OK){
                String name = intent.getExtras().getString("name");
                Toast toast = Toast.makeText(getBaseContext(), name, Toast.LENGTH_LONG);
                toast.show();
            }
        }
    }
}
